import React, { useState } from "react";

const Form = (props) => {
    const [color, setColor] = useState("");

    const submitt = (e) => {
        e.preventDefault();
        props.box(color);


    };
    return (
        <div>

        <form onSubmit={submitt}>
            <div>
                <input type="text" placeholder="color" onChange={(e) =>setColor(e.target.value) }  value={color}/>
                <button>
                    submit
                </button>
            </div>
        </form>
        </div>
    )
    
};
export default Form;