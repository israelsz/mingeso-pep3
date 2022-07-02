const Producto = ({id, nombre, valor}) => {
  return (
    <tr>
        <th scope="row">{id}</th>
        <td>{nombre}</td>
        <td>{valor}</td>
    </tr>
  )
}

export default Producto