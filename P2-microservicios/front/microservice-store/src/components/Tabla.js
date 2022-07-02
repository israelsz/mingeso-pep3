import Producto from "./Producto";

const Tabla = ({ productos }) => {
  return (
    <div>
      <table className="table table-dark table-striped">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Producto</th>
            <th scope="col">Precio $CLP</th>
          </tr>
        </thead>
        <tbody>
          {productos.map((x, index) => {
            return (
              <Producto
                id={x.id+1}
                nombre={x.nombre}
                valor={x.precio}
                key={index}
              />
            );
          })}
        </tbody>
      </table>
    </div>
  );
};

export default Tabla;
