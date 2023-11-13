package person1;

import java.util.Date;

public class Client extends Person1 {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Client(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Client.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
     
}