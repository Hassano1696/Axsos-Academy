import React from "react";
import { useParams } from "react-router";
const Words = () => {
    const { param, bgColor, color } = useParams();
    return (
        <div className="all" >
            <div>
                {isNaN(+param) ? (
                    <h3 style={{ backgroundColor: bgColor, color: color }}>
                        The word is: {param}{" "}
                    </h3>
                ) : (
                    <h3>The Number is: {param} </h3>
                )}
            </div>
        </div>
    );
};
export default Words;
