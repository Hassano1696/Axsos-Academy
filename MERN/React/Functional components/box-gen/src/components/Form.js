import React, { useState } from "react";

const Form = (props) => {
    const [color, setColor] = useState("");
    const [dim, setDim] = useState(0);

    const submitt = (e) => {
        e.preventDefault();
        props.box(color,dim);
        setColor("");
        setDim("");


    };
    return (
        <div>

        <form onSubmit={submitt}>
            <div>
                <input type="text" placeholder="color" onChange={(e) =>setColor(e.target.value) }  value={color}/>
                <input type="number" placeholder="dim" onChange={(e) =>setDim(e.target.value) }  value={dim}/>
                <button>
                    submit
                </button>
            </div>
        </form>
        </div>
    )
    
};
export default Form;