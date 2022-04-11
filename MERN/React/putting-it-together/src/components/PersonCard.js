import React from "react"

class PersonCard extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
        age: this.props.age,
        };
    }
    
    addyear = () => {
        const age = this.state.age;
        this.setState({ age: age + 1 });
    };
    
    render() {
        return (
            <div>
                <h1>{ this.props.lastName }, { this.props.firstName }</h1>
                <p> Age: { this.state.age }</p>
                <p> Hair Color: { this.props.hairColor }</p>
                <button onClick={this.addyear}>
        Increase the age
        </button>
            
            </div>
        );
    }
}
export default PersonCard;
