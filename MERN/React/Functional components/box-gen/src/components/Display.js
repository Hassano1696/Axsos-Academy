import React, { useState } from "react";
import './index.css';

const Display=(props)=>{

return (
    <main>

    <div className="outside">
        {props.boxes.map((box,i) =>
            <div className="box"
            key={i}
            style={{
                backgroundColor:box,
                width:"60px",
                height:"60px"
            }}
            ></div>
            
        )}
            </div>
    </main>
)


}
export default Display