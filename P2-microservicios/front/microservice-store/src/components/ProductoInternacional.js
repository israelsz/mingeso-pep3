const ProductoInternacional = ({id, nombre, clp, usd, euro}) => {
  return (
    <tr>
        <th scope="row">{id}</th>
        <td>{nombre}</td>
        <td>{clp}</td>
        <td>{Math.trunc(usd*100)/100}</td>
        <td>{Math.trunc(euro*100)/100}</td>
    </tr>
  )
}

export default ProductoInternacional