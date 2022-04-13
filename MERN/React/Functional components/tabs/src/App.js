import logo from './logo.svg';
import './App.css';
import Tabs from "./components/Tabs"
const tabs=["Tab 1","Tab 2","Tab 3"];

function App() {
  return (
    <div className="App">
    <Tabs tabs={tabs} />
    </div>
  );
}

export default App;
