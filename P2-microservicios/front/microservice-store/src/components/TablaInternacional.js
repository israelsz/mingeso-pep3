import ProductoInternacional from "./ProductoInternacional";

const TablaInternacional = ({ productos }) => {
  return (
    <div>
      <table className="table table-dark table-striped">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Producto</th>
            <th scope="col">Precio $CLP</th>
            <th scope="col">Precio $USD</th>
            <th scope="col">Precio €Euro</th>
          </tr>
        </thead>
        <tbody>
          {productos.map((x, index) => {
            return (
              <ProductoInternacional
                id={x.id + 1}
                nombre={x.nombre}
                clp={x.precio}
                usd={x.precioUsd}
                euro={x.precioEuro}
                key={index}
              />
            );
          })}
        </tbody>
      </table>
    </div>
  );
};

export default TablaInternacional;
