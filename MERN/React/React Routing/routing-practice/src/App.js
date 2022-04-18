import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Words from "./components/Words";
import Home from "./components/Home";

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
