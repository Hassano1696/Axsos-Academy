import React, { useState } from "react";

const UserForm = (props) => {
    const [firstName, setFirstname] = useState("");
    const [fnError, setFNError] = useState("");
    const [lastName, setLastname] = useState("");
    const [lnError, setLNError] = useState("");
    const [email, setEmail] = useState("");
    const [emailError, setEmailError] = useState("");
    const [password, setPassword] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmPassword, setConfirmpassword] = useState("");
    const [CPError, setCPError] = useState("");

    const firstNameHandler = (e) => {
        setFirstname(e.target.value);
        if (e.target.value.length === 0 || e.target.value.length >= 2) {
            setFNError("");
        } else if (e.target.value.length < 2) {
            setFNError("First name must be at least 2 characters!");
        }
    };
    const lastNameHandler = (e) => {
        setLastname(e.target.value);
        if (e.target.value.length === 0 || e.target.value.length >= 2) {
            setLNError("");
        } else if (e.target.value.length < 2) {
            setLNError("Last name must be at least 2 characters!");
        }
    };

    const emailHandler = (e) => {
        setEmail(e.target.value);
        if (e.target.value.length === 0 || e.target.value.length >= 5) {
            setEmailError("");
        } else if (e.target.value.length < 5) {
            setEmailError("Email must be at least 5 characters!");
        }
    };

    const passwordHandler = (e) => {
        setPassword(e.target.value);

        if (e.target.value.length === 0 || e.target.value.length >= 8) {
            setPasswordError("");
        } else if (e.target.value.length < 8) {
            setPasswordError("Password must be at least 8 characters!");
        }
    };

    const confirmPasswordHandler = (e) => {
        setConfirmpassword(e.target.value);
        if (e.target.value.length === 0 || confirmPassword === password) {
            setCPError("");
        } else if (password !== confirmPassword) {
            setCPError("Passwords must match!");
        }
    };

    return (
        <>
            <form>
                <div>
                    <label>First Name: </label>
                    <input type="text" onChange={firstNameHandler} />
                {fnError ? <p style={{ fontSize:3, color: "red" }}>{fnError}</p> : ""}
                </div>
                <div>
                    <label>Last Name: </label>
                    <input type="text" onChange={lastNameHandler} />
                    {lnError ? <p style={{fontSize:3,  color: "red" }}>{lnError}</p> : ""}
                </div>

                <div>
                    <label>Email Address: </label>
                    <input type="text" onChange={emailHandler} />
                    {emailError ? <p style={{fontSize:3,  color: "red" }}>{emailError}</p> : ""}
                </div>

                <div>
                    <label>Password: </label>
                    <input type="password" onChange={passwordHandler} />
                    {passwordError ? <p style={{fontSize:3,  color: "red" }}>{passwordError}</p> : ""}
                </div>
                <div>
                    <label>Confirm Password: </label>
                    <input type="password" onChange={confirmPasswordHandler} />
                    {CPError ? (<p style={{ fontSize:3, color: "red" }}>{CPError}</p>) : ("")}
                </div>
            </form>
        </>
    );
};

export default UserForm;
