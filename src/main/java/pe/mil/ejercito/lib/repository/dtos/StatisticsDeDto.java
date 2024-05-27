package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * StatisticsDeDto
 * <p>
 * StatisticsDeDto class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsDeDto extends StatisticsDateDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private double acasMachinery;
    private double acasHealth;
    private double acasSocial;
    private double acasSocialConflict;
    private double pciAPnpIlegalMining;
    private double pciAPnpForestFire;
    private double pciAPnpTdi;
    private double pciAPnpTim;
    private double arEconomicSocial;
    private double arScienceTechnology;
    private double arArchaeologicalHistorical;
    private double aeArAntarcticAmazonAffairs;
    private double arEnvironmentalProtection;
    private double hitoAmount;
    private double hitoOrders;
    private double hitoRecognition;
    private double hitoMaintenance;
}