import React, { useState } from "react";
import './tabs.css';
import './animate.css';



const Tabs = (props)=>{
const [active, setActive] = useState("");
const activeHandler=(e,tabs) =>{
    setActive(tabs + " content is Showing ")
}





return (
    <paper>
        <div className="tabs mt-5">

        <ul>
            {props.tabs.map((tabs, i) => 
                <li key={i}   onClick={(e) =>activeHandler(e,tabs)} value={tabs}  ><button className="btn btn-primary">{tabs}</button ></li>
            )}
            </ul>
            <div>
        </div>
<p className="border border-danger">
    {active}    
</p>
            </div>
    </paper>


)
        }
export default Tabs