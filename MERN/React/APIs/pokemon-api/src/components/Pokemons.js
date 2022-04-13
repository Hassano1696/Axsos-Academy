import React, { useState } from "react";

const Pokemons = () => {
    const [pokemons, setPokemons] = useState([]);

    const getPokemons = () => {
        fetch("https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0")
            .then((response) => response.json())
            .then((response) => setPokemons(response.results));
    };
    return (
        <div className="container-fluid col-8 mt-5  ">
            <div className="row ">
                
                <div className="col-6 text-start">
        <th>

                <button className="btn btn-primary mb-3 align-center" onClick={getPokemons}>
                            Fetch Pokemon
                        </button>
        </th>
                    <table class=" text-center">
                        
                        <tr  scope="row">
                            Pokemon's Name:{pokemons ? pokemons.map((pokemon, i) => <tr key={i}>{i + 1}  {pokemon.name}</tr>) : " "}
                        </tr>
                        


                    </table>

                </div>
            </div>
        </div>
    );
};

export default Pokemons;
