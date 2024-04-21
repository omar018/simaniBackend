package unal.backend.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Data
@Getter
@NoArgsConstructor
public class AdministrativoEntrante {
    private UUID id;
    @Setter
    private int year;
    @Setter
    private int semester;
    @Setter
    private String idTypeDocument;
    @Setter
    private Long idDocument;
    private String firstName;
    private String middleName;
    private String firstSurname;
    private String secondSurname;
    private int idForeignCountry;
    private String foreignInstitution;
    private int idTipoMovAdmExtranj;
    private int numMovilityDays;
    private Character mobilityByAgreement;
    private String agreementCode;
    private int idNationalSourceResearch;
    private Long valueNationalFinancing;
    private int idInternationalSource;
    private int idFinancingCountry;
    private Long valueInternationalFinancing;

    public AdministrativoEntrante(UUID id){ this.id = id; }


    public void inizializeAdministrativoEntrante(UUID id, int year, int semester, String idTypeDocument, Long idDocument, String firstName, String middleName, String firstSurname, String secondSurname, int idForeignCountry, String foreignInstitution, int idTipoMovAdmExtranj, int numMovilityDays, Character mobilityByAgreement, String agreementCode, int idNationalSourceResearch, Long valueNationalFinancing, int idInternationalSource, int idFinancingCountry, Long valueInternationalFinancing) {
        setId(id);
        setYear(year);
        setSemester(semester);
        setIdTypeDocument(idTypeDocument);
        setIdDocument(idDocument);
        setFirstName(firstName);
        setMiddleName(middleName);
        setFirstSurname(firstSurname);
        setSecondSurname(secondSurname);
        setIdForeignCountry(idForeignCountry);
        setForeignInstitution(foreignInstitution);
        setIdTipoMovAdmExtranj(idTipoMovAdmExtranj);
        setNumMovilityDays(numMovilityDays);
        setMobilityByAgreement(mobilityByAgreement);
        setAgreementCode(agreementCode);
        setIdNationalSourceResearch(idNationalSourceResearch);
        setValueNationalFinancing(valueNationalFinancing);
        setIdInternationalSource(idInternationalSource);
        setIdFinancingCountry(idFinancingCountry);
        setValueInternationalFinancing(valueInternationalFinancing);
    }

    /* TODO: Validar datos si van a ser creados desde el sistema (Por confirmar)  */


}
