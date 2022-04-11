import PersonCard from "./components/PersonCard";
import './App.css';

function App() {
  return (
    <><PersonCard firstName="John" lastName="Smith" age={8} hairColor="Brown" />
    <PersonCard firstName="hassan" lastName="odeh" age={25} hairColor="black" />
    <PersonCard firstName="akram" lastName="issa" age={20} hairColor="red" />
    <PersonCard firstName="ahmad" lastName="marab" age={26} hairColor="blonde" /></> 

  );
}

export default App;
