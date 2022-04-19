    import React, { useState } from "react";
    import { useNavigate } from "react-router-dom";

    const Form = () => {
        const [selectedOption, setSelectedOption] = useState("People");
        const [id, setId] = useState(0);

    const navigate = useNavigate();

        const submitHandler = (e) => {
        e.preventDefault();
        navigate(`/${selectedOption}/${id}`);
    };

    return (
<form class="form-inline" onSubmit={submitHandler}>
<label class="my-1 mr-2" for="inlineFormCustomSelectPref">Search For:</label>
<select class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref"
        value={selectedOption}
        onChange={(e) => setSelectedOption(e.target.value)}
>
    <option selected>Choose...</option>
    <option value="people">People</option>
    <option value="planets">Planets</option>
    <option value="starships">Starships</option>
</select>
    <div class="col">
    <label class="my-1 mr-2" for="inlineFormCustomSelectPref">ID:</label>

    <input class="form-control"   type="number"
        value={id}
        onChange={(e) => setId(e.target.value)}
>

</input>
        <button className="btn btn-primary float-end">Submit</button>

</div>
</form>        
    );
    };

    export default Form;
