import React from "react";
import { useEffect, useState } from "react";
import { BrowserRouter, Route, Routes, Link } from "react-router-dom";
import { useParams } from "react-router";
import axios from "axios";

const Star = () => {
  const { id } = useParams();
  const [specs, setSpecs] = useState("");
  const [error, setError] = useState("");

  useEffect(() => {
    setError("");
    axios
      .get(`https://swapi.dev/api/starships/${id}`)
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
        </>
      ) : (
        <>
          <h1>{specs.name}</h1>
          <p>Model: {specs.model}</p>
          <p>Manufacturer: {specs.manufacturer}</p>
          <p>No of crew: {specs.crew}</p>
          <p>No of passengers: {specs.passengers}</p>
        </>
      )}
    </div>
  );
};

export default Star;
