import React from "react";
import { useEffect, useState } from "react";
import { useParams } from "react-router";
import axios from "axios";

const People = () => {
  const { id } = useParams();
  const [specs, setSpecs] = useState("");
  const [error, setError] = useState("");
  const [homeworld, setHomeworld] = useState("");
  const [planetUrl, setPlanetUrl] = useState("");
  //we want to make the call when the component first renders that is why we are using
  useEffect(() => {
    setError("");
    axios
      .get(`https://swapi.dev/api/people/${id}`)
      .then((res) => {
        axios
          .get(res.data.homeworld)
          .then((res) => setHomeworld(res.data.name));
        setSpecs(res.data);
        setPlanetUrl(res.data.homeworld.replace("https://swapi.dev/api", ""));
      })

      .catch(() => {
        setError("These aren't the droids your looking for!");
      });
  }, [id]); 
  return (
    <div className="row">
      <div className="col-6 ">
        {error ? (
          <>
            <h5>{error}</h5>
          </>
        ) : (
          <>
            <h1>{specs.name}</h1>
            <p>Mass: {specs.mass}</p>
            <p>Height: {specs.height}</p>
            <p>Hair Color: {specs.hair_color}</p>
            <p>Skin Color: {specs.skin_color}</p>
            <p>Homeworld: {homeworld}</p>
          </>
        )}
      </div>
    </div>
  );
};

export default People;
