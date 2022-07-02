const Switch = ({evento}) => {
  return (
    <div className="form-check form-switch mt-3 mb-3">
        <input className="form-check-input slider" type="checkbox" role="switch" id="flexSwitchCheckDefault" onClick={evento}/>
        <label className="form-check-label sliderTitle" htmlFor="flexSwitchCheckDefault">Mostrar precios internacionales</label>
    </div>
  )
}

export default Switch