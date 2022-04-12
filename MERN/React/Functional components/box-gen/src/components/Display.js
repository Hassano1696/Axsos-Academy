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
                backgroundColor:box[0],
                width: box[1] + "px",
                height:box[1] + "px",
            }}
            ></div>
            
        )}
            </div>
    </main>
)


}
export default Display