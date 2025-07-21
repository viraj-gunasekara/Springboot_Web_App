import "./App.css";
import Authentication from "./pages/Authentication/Authentication";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import HomePage from "./pages/HomePage/HomePage";
// import { Provider } from "react-redux";
// import { store } from "./Redux/store"

function App() {
  return (
    // <Provider store={store}>
    <div className="">
      <BrowserRouter>
        <Routes>
          
          <Route path="/*" element={<Authentication />} />
          <Route path="/*" element={<HomePage />} />
        </Routes>
      </BrowserRouter>
    </div>
    // </Provider>
  );
}

export default App;
