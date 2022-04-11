import React, { useState } from  'react';
    
    
const UserForm = (props) => {
    const [firstname, setFirstName] = useState("");
    const [lastName, setLastname] = useState("")
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");  
    const [confirmPassword, setConfirmpassword] = useState("");

    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstname,lastName, email, password,confirmPassword };
        console.log("Welcome", newUser);
    };
    
    return(
        <><form onSubmit={createUser}>
            <div>
                <label>First Name: </label>
                <input type="text" onChange={(e) => setFirstName(e.target.value)} />
            </div>
            <div>
                <label>First Name: </label>
                <input type="text" onChange={(e) => setLastname(e.target.value)} />
            </div>

            <div>
                <label>Email Address: </label>
                <input type="text" onChange={(e) => setEmail(e.target.value)} />
            </div>
            <div>
                <label>Password: </label>
                <input type="text" onChange={(e) => setPassword(e.target.value)} />
            </div>
            <div>
                <label>Password: </label>
                <input type="text" onChange={(e) => setConfirmpassword(e.target.value)} />
            </div>

        </form><div>
                <h4>Your Form Data:</h4>
                <p>First Name: {firstname}</p>
                <p>Last Name: {lastName}</p>
                <p>Email: {email}</p>
                <p>Password: {password}</p>
                <p>Confirm Password: {confirmPassword}</p>
            </div></>

    );
};
    
export default UserForm;