//You can use rafce at the beginning to create the set up for a component
import React from "react";
import { useEffect, useState } from "react";
import { BrowserRouter, Route, Routes, Link } from "react-router-dom";
import { useParams } from "react-router";
import axios from "axios";

const Planet = () => {
  const { id } = useParams();
  const [specs, setSpecs] = useState("");
  const [error, setError] = useState("");
  useEffect(() => {
    setError("");
    axios
      .get(`https://swapi.dev/api/planets/${id}`)
      .then((res) => setSpecs(res.data))
      .catch(() => {
        setError("These aren't the droids your looking for!");
      });
  }, [id]); //use the id here so useEffect will fire every time the id is changed

  return (
    <div>
      {error ? (
        <>
          <h5>{error}</h5>
          <img
            src="https://www.denofgeek.com/wp-content/uploads/2019/08/star-wars-obi-wan-kenobi-1-scaled.jpg?resize=768%2C432"
            alt="Obi Wan"
          />
        </>
      ) : (
        <>
          <h1>{specs.name}</h1>
          <p>climate: {specs.climate}</p>
          <p>terrain: {specs.terrain}</p>
          <p>surface_water: {specs.surface_water}</p>
          <p>population: {specs.population}</p>
        </>
      )}
    </div>
  );
};

export default Planet;
