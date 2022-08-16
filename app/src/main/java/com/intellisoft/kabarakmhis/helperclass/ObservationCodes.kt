package com.intellisoft.kabarakmhis.helperclass


enum class DbObservationValues{

    ANC_PNC_CODE,
    KMHFL_CODE,
    EDUCATION_LEVEL,
    CLIENT_NAME,
    DATE_OF_BIRTH,
    MARITAL_STATUS,

    COUNTY_NAME,
    SUB_COUNTY_NAME,
    WARD_NAME,
    TOWN_NAME,
    ADDRESS_NAME,
    ESTATE_NAME,
    PHONE_NUMBER,


    GRAVIDA,
    PARITY,
    HEIGHT,
    WEIGHT,
    LMP,
    EDD,
    RELATIONSHIP,
    GESTATION,

    SURGICAL_HISTORY,
    DIABETES,
    HYPERTENSION,
    MEDICAL_HISTORY,
    BLOOD_TRANSFUSION,
    TUBERCULOSIS,
    DRUG_ALLERGY,

    TWINS,

    GENERAL_EXAMINATION,
    SYSTOLIC_BP,
    DIASTOLIC_BP,
    PULSE_RATE,
    CVS,
    RESPIRATORY_MONITORING,
    BREAST_EXAM,

    ABDOMINAL_INSPECTION,
    ABDOMINAL_PALPATION,
    ABDOMINAL_AUSCALATION,

    EXTERNAL_INSPECTION,
    EXTERNAL_PALPATION,
    EXTERNAL_DISCHARGE,
    EXTERNAL_GENITAL_ULCER,
    EXTERNAL_FGM,

    PREGNANCY_ORDER,
    YEAR,
    ANC_NO,
    CHILDBIRTH_PLACE,
    LABOUR_DURATION,
    DELIVERY_MODE,

    BABY_WEIGHT,
    BABY_SEX,
    BABY_OUTCOME,
    BABY_PURPERIUM,

    HB_TEST,
    BLOOD_GROUP_TEST,
    RHESUS_TEST,
    BLOOD_RBS_TEST,

    URINALYSIS_TEST,
    URINALYSIS_RESULTS,

    TB_SCREENING,
    TB_RESULTS,
    TB_DIAGNOSIS,
    IPT_ELIGIBILITY,
    IPT_DATE,
    IPT_VISIT,

    MULTIPLE_BABIES,
    OBSTERIC_ULTRASOUND_1,
    OBSTERIC_ULTRASOUND_2,

    ART_ELIGIBILITY,
    PARTNER_HIV,

    ARV_ANC,
    HAART_ANC,
    COTRIMOXAZOLE,

    HIV_TESTING,
    HIV_RESULTS,
    HIV_STATUS,
    HIV_NR_DATE,

    SYPHILIS_TESTING,
    SYPHILIS_RESULTS,
    SYPHILIS_MOTHER_STATUS,

    HEPATITIS_TESTING,
    HEPATITIS_RESULTS,
    HEPATITIS_MOTHER_STATUS,

    COUPLE_HIV_TESTING,
    PARTNER_HIV_STATUS,
    PARTNER_HIV_RESULTS,

    FACILITY_NAME,
    FACILITY_NUMBER,

    ATTENDANT_NAME,
    ATTENDANT_NUMBER,
    ATTENDANT_DESIGNATION,

    COMPANION_NAME,
    COMPANION_NUMBER,
    COMPANION_RELATIONSHIP,
    COMPANION_TRANSPORT,

    DONOR_NAME,
    DONOR_NUMBER,
    DONOR_BLOOD_GROUP,

    FINANCIAL_PLAN,

    CLINICAL_NOTES_DATE,
    CLINICAL_NOTES,
    CLINICAL_NOTES_NEXT_VISIT,

    CONTACT_NUMBER,
    MUAC,

    PALLOR,
    FUNDAL_HEIGHT,

    PRESENTATION,
    LIE,
    FOETAL_HEART_RATE,
    FOETAL_MOVEMENT,
    NEXT_VISIT_DATE,

    TT_PROVIDED,
    TT_RESULTS,

    TIMING_CONTACT,
    DOSE,
    IPTP_SP,
    IPTP_RESULT,
    LLITN_GIVEN,
    LLITN_RESULTS,

    REPEAT_SEROLOGY,
    REPEAT_SEROLOGY_RESULTS,
    REPEAT_SEROLOGY_DETAILS,
    REACTIVE_MATERNAL_SEROLOGY,
    PARTNER_REACTIVE_SEROLOGY,
    NON_REACTIVE_SEROLOGY,

    DEWORMING,

    IRON_SUPPLIMENTS,
    DRUG_GIVEN,
    OTHER_SUPPLIMENTS,
    ANC_CONTACT,
    CONTACT_TIMING,
    TABLET_NUMBER,

    DOSAGE_AMOUNT,
    DOSAGE_FREQUENCY,
    DOSAGE_DATE_GIVEN,
    IRON_AND_FOLIC_COUNSELLING,

    IPTP_DATE,

    INTERVENTION_GIVEN,
    DATE_STARTED,
    REGIMEN,
    ART_DOSAGE,
    ART_FREQUENCY,
    REGIMENT_CHANGE,
    VIRAL_LOAD_CHANGE,
    VIRAL_LOAD_RESULTS,

    DANGER_SIGNS,
    DENTAL_HEALTH,
    BIRTH_PLAN,
    RH_NEGATIVE,

    EAT_ONE_MEAL,
    EAT_MORE_MEALS,
    DRINK_WATER,
    TAKE_IFAS,
    AVOID_HEAVY_WORK,
    SLEEP_UNDER_LLIN,
    GO_FOR_ANC,
    NON_STRENUOUS_ACTIVITY,

    INFANT_FEEDING,
    EXCLUSIVE_BREASTFEEDING,

    MOTHER_PALE,
    SEVERE_HEADACHE,
    VAGINAL_BLEEDING,
    ABDOMINAL_PAIN,
    REDUCED_MOVEMENT,

    MOTHER_FITS,
    WATER_BREAKING,
    SWOLLEN_FACE,
    FEVER







}

enum class DbSummaryTitle{

    //Patient Details
    A_FACILITY_DETAILS,
    B_PATIENT_DETAILS,
    C_CLINICAL_INFORMATION,
    D_RESIDENTIAL_INFORMATION,
    E_CONTACT_INFORMATION,
    F_NEXT_OF_KIN,

    //Medical and Surgical History
    A_SURGICAL_HISTORY,
    B_MEDICAL_HISTORY,
    C_DRUG_ALLERGIES,
    D_FAMILY_HISTORY,

    //Preview Physical Exam
    A_PHYSICAL_EXAMINATION,
    B_PHYSICAL_BLOOD_PRESSURE,
    C_WEIGHT_MONITORING,
    D_ABDOMINAL_EXAMINATION,
    E_EXTERNAL_GENITALIA_EXAM,

    //Antenatal Profile
    A_BLOOD_TESTS,
    B_URINE_TESTS,
    C_TB_SCREEN,
    D_OBSTETRIC_ULTRASOUND,
    E_HIV_STATUS,
    F_MATERNAL_HAART,
    G_HIV_TESTING,
    H_SYPHILIS_TESTING,
    I_HEPATITIS_TESTING,
    J_COUPLE_COUNSELLING_TESTING,

    //Birth Plan
    A_BIRTH_PLAN,
    B_BIRTH_ATTENDANT,
    C_ALTERNATIVE_BIRTH_ATTENDANT,
    D_BIRTH_COMPANION,
    E_ALTERNATIVE_BIRTH_COMPANION,
    F_BLOOD_DONOR,
    E_FINANCIAL_PLAN,

    //Clinical Notes
    CLINICAL_NOTES,

    //Present Pregnancy
    A_CURRENT_PREGNANCY,
    B_PRESENT_BLOOD_PRESSURE,
    C_HB_TEST,
    D_PRESENTATION,

    //Tetanus Diphtheria
    TETANUS_DIPHTHERIA,

    //Malaria Prophylaxis
    A_ANC_VISIT,
    B_LLITN_GIVEN,

    //Maternal Serology
    A_MATERNAL_SEROLOGY,
    B_REACTIVE,
    C_NON_REACTIVE,

    //Deworming
    DEWORMING,

    //Iron and Folic Suppliments
    A_IRON_SUPPLIMENTS,
    B_FIRST_CONTACT_BEFORE_ANC,
    C_IFAS_DOSAGE,
    D_ANC_CONTACT,

    //PMTCT
    A_INTERVENTION_GIVEN,
    B_ART_FOR_LIFE,
    C_PMTCT_DOSAGE,
    D_VL_SAMPLE,

    //Counselling
    A_COUNSELLING_DONE,
    B_PREGNANCY_COUNSELLING,
    C_INFANT_COUNSELLING,
    D_PREGNANCY_COUNSELLING_DETAILS,





}
