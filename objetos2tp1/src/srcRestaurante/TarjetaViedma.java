package srcRestaurante;

public class TarjetaViedma implements TarjetaCredito {

	public TarjetaViedma() {

	}

	@Override
	public Double calcularDescuento(Pedido pedidoAsociado) {
		// TODO Auto-generated method stub
		return pedidoAsociado.montoTotal();
	}

}
