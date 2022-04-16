import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./components/Home";
import Words from "./components/Words";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/home" element={<Home />} />
        <Route path="/:param" element={<Words />} />
        <Route path="/:param/:color/:bgColor" element={<Words />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
