package com.microservicios.perfilamiento.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "sirim_perfilamientos")
@Data
@EqualsAndHashCode(of = { "idPerfilamiento" })
public class Perfilamiento implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "nIdPerfilamiento")
   private Long idPerfilamiento;

   @Column(name = "sOperadorSalaAlertas", length = 55, nullable = false)
   private String operadorSalaAlertas;

   @Column(name = "sPasajero", length = 90, nullable = false)
   private String pasajero;

   @Column(name = "sNacionalidad", length = 55, nullable = false)
   private String nacionalidad;

   @Column(name = "sArea", length = 55, nullable = false)
   private String area;

   @Column(name = "sTipoDocumento", length = 55, nullable = false)
   private String tipoDocumento;

   @Column(name = "sNumeroDocumento", length = 20, nullable = false)
   private String numeroDocumento;

   @Column(name = "sTipoControl", length = 1, nullable = false)
   private String tipoControl;

   @Column(name = "sAerolinea", length = 55, nullable = false)
   private String aerolinea;

   @Column(name = "sProcedencia", length = 55, nullable = false)
   private String procedencia;

   @Column(name = "sDestino", length = 55, nullable = false)
   private String destino;

   @Column(name = "bPrimeraVisitaPais", nullable = true)
   private boolean primeraVisitaPais;

   @Column(name = "sDetallePrimeraVisitaPais", length = 500, nullable = true)
   private String detallePrimeraVisitaPais;

   @Column(name = "sOcupacion", length = 60, nullable = true)
   private String ocupacion;

   @Column(name = "sIngresoPromedio", length = 20, nullable = true)
   private String ingresoPromedio;

   @Column(name = "sTelefono", length = 15, nullable = true)
   private String telefono;

   @Column(name = "sCorreo", length = 55, nullable = true)
   private String correo;

   @Column(name = "sMotivoViaje", length = 55, nullable = true)
   private String motivoViaje;

   @Column(name = "nDiasPermanencia", nullable = true)
   private int diasPermanencia;

   @Column(name = "sLugaresVisita", length = 255, nullable = true)
   private String lugaresVisita;

   @Column(name = "bBoletoRetorno", nullable = true)
   private boolean boletoRetorno;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "dFechaRetorno", nullable = true)
   private Date fechaRetorno;

   @Column(name = "bViajoAnteriormente", nullable = true)
   private boolean viajoAnteriormente;

   @Column(name = "sPaisVisito", length = 55, nullable = true)
   private String paisVisito;

   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "dFechaAproximada", nullable = true)
   private Date fechaAproximada;

   @Column(name = "sConocidoFamiliarPeru", length = 55, nullable = true)
   private String conocidoFamiliarPeru;

   @Column(name = "sTipoAlojamiento", length = 25, nullable = true)
   private String tipoAlojamiento;

   @Column(name = "sLugarAlojamiento", length = 255, nullable = true)
   private String lugarAlojamiento;

   @Column(name = "nCostoAlojamiento", nullable = true)
   private Double costoAlojamiento;

   @Column(name = "bViajaAcompañado", nullable = true)
   private boolean viajaAcompañado;

   @Column(name = "sDetalleViaje", length = 255, nullable = true)
   private String detalleViaje;

   @Column(name = "nCantidadEquipaje", nullable = true)
   private int cantidadEquipaje;

   @Column(name = "nMontoBolsaViaje", length = 255, nullable = true)
   private String montoBolsaViaje;

   @Column(name = "bAntecedentesPenales", nullable = true)
   private boolean antecedentesPenales;

   @Column(name = "sDetalleAntecedentesPenales", length = 255, nullable = true)
   private String detalleAntecedentesPenales;

   @Column(name = "bFueInadmitido", nullable = true)
   private boolean fueInadmitido;

   @Column(name = "sPaisInadmision", length = 55, nullable = true)
   private String paisInadmision;

   @Column(name = "sInformacionAdicional", length = 5000, nullable = true)
   private String informacionAdicional;

   /**
   *
   */
   private static final long serialVersionUID = 1L;

}
