package pe.edu.upc.aaw.proyecto_awb.entities;

import javax.persistence.*;

@Entity
@Table(name = "Servicios_XLocales")
public class Servicios_XLocales {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSerxL;
    @ManyToOne
    @JoinColumn(name = "locales_id")
    private Locales locales;


    @ManyToOne
    @JoinColumn(name = "servicios_id")
    private Servicios servicios;



    public Servicios_XLocales() {
    }

    public Servicios_XLocales(int idSerxL, Locales locales, Servicios servicios) {
        this.idSerxL = idSerxL;
        this.locales = locales;
        this.servicios = servicios;

    }

    public int getIdSerxL() {
        return idSerxL;
    }

    public void setIdSerxL(int idSerxL) {
        this.idSerxL = idSerxL;
    }

    public Locales getLocales() {
        return locales;
    }

    public void setLocales(Locales locales) {
        this.locales = locales;
    }

    public Servicios getServiciosdisponibles() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }


}
