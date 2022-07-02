import { useEffect, useState } from "react";
import axios from "axios";
import Switch from "./components/Switch";
import Tabla from "./components/Tabla";
import TablaInternacional from "./components/TablaInternacional";
import cheems from './assets/cheems.png';

const App = () => {
  const [estadoBoton, setEstadoBoton] = useState(false);

  //variables para almacenar productos del backend a traves del hook de useState
  const [productos, setProductos] = useState([]);
  const [productosAdicionales, setProductosAdicionales] = useState([]);

  //Funciones de eventos
  const handleClick = () => {
    setEstadoBoton(!estadoBoton);
    console.log(estadoBoton);
  };

  const renderizarTabla = () => {
    if (estadoBoton) {
      return <TablaInternacional productos={productosAdicionales} />;
    } else {
      return <Tabla productos={productos} />;
    }
  };

  //Se usa el hook useEffect y la libreria axios
  //para hacer el fetch al backend
  useEffect(() => {
    axios.get("http://localhost:8080/producto").then((response) => {
      setProductos(response.data);
    });
  }, []);

  useEffect(() => {
    axios
      .get("http://localhost:8080/calcularnuevosprecios")
      .then((response) => {
        setProductosAdicionales(response.data);
        console.log(response.data);
      });
  }, []);

  return (
    <div>
      <div className="container mb-5 tituloPrincipal">
        <h1 className="titulo">Tienda de microservicios REACT</h1>
        <img className="logoImage" src={cheems} alt="logo" />
      </div>
      <div className="container main">
        <Switch evento={handleClick} />
        {renderizarTabla()}
      </div>

    </div>
  );
};

export default App;
