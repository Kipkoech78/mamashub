package com.intellisoft.kabarakmhis.new_designs.screens

import android.app.Application
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModelProvider
import com.google.android.fhir.FhirEngine
import com.intellisoft.kabarakmhis.R
import com.intellisoft.kabarakmhis.fhir.FhirApplication
import com.intellisoft.kabarakmhis.fhir.viewmodels.PatientDetailsViewModel
import com.intellisoft.kabarakmhis.helperclass.FormatterClass
import com.intellisoft.kabarakmhis.network_request.requests.RetrofitCallsFhir
import com.intellisoft.kabarakmhis.new_designs.NewMainActivity
import com.intellisoft.kabarakmhis.new_designs.antenatal_profile.AntenatalProfileView
import com.intellisoft.kabarakmhis.new_designs.birth_plan.BirthPlanView
import com.intellisoft.kabarakmhis.new_designs.clinical_notes.ClinicalNotesList
import com.intellisoft.kabarakmhis.new_designs.counselling.CounsellingView
import com.intellisoft.kabarakmhis.new_designs.deworming.DewormingView
import com.intellisoft.kabarakmhis.new_designs.ifas.IfasList
import com.intellisoft.kabarakmhis.new_designs.malaria_propylaxis.MalariaProphylaxisList
import com.intellisoft.kabarakmhis.new_designs.matenal_serology.MaternalSerologyView
import com.intellisoft.kabarakmhis.new_designs.medical_history.MedicalSurgicalHistoryView
import com.intellisoft.kabarakmhis.new_designs.physical_examination.PhysicalExaminationList
import com.intellisoft.kabarakmhis.new_designs.pmtct.PMTCTInterventionsView
import com.intellisoft.kabarakmhis.new_designs.present_pregnancy.PresentPregnancyList
import com.intellisoft.kabarakmhis.new_designs.tetanus_diptheria.PreventiveServiceList
import com.intellisoft.kabarakmhis.new_designs.previous_pregnancy.PreviousPregnancyList
import com.intellisoft.kabarakmhis.new_designs.weight_monitoring.WeightMonitoringChart
import kotlinx.android.synthetic.main.activity_patient_profile.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PatientProfile : AppCompatActivity() {

    private val formatter = FormatterClass()
    private lateinit var patientDetailsViewModel: PatientDetailsViewModel
    private lateinit var patientId: String
    private lateinit var fhirEngine: FhirEngine
    private val formatterClass = FormatterClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_profile)

        patientId = formatterClass.retrieveSharedPreference(this, "patientId").toString()
        fhirEngine = FhirApplication.fhirEngine(this)

        patientDetailsViewModel = ViewModelProvider(this,
            PatientDetailsViewModel.PatientDetailsViewModelFactory(application,fhirEngine, patientId)
        )[PatientDetailsViewModel::class.java]

        title = "Patient Details"


        navigate()

    }

    private fun calluser(value: String){
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:$value")
        startActivity(dialIntent)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onStart() {
        super.onStart()

        getPatientData()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getPatientData() {

        val patientData = patientDetailsViewModel.getPatientData()

        val patientName = patientData.name
        val dob = patientData.dob

        val kinName = patientData.kinData.name
        val kinPhone = patientData.kinData.phone

        tvName.text = patientName
        tvAge.text = dob

        tvKinName.text = kinName
        tvKinDetails.text = kinPhone



    }



    private fun navigate() {
        navigateClinicalNotes.setOnClickListener { startActivity(Intent(this, ClinicalNotesList::class.java))}
        navigateBirthPlan.setOnClickListener { startActivity(Intent(this, BirthPlanView::class.java))}
        navigatePresent.setOnClickListener { startActivity(Intent(this, PresentPregnancyList::class.java))}
        navigatePhysicalExam.setOnClickListener { startActivity(Intent(this, PhysicalExaminationList::class.java))}
        navigateWeight.setOnClickListener { startActivity(Intent(this, WeightMonitoringChart::class.java))}
        navigateMedicalHistory.setOnClickListener { startActivity(Intent(this, MedicalSurgicalHistoryView::class.java))}
        navigatePreviousPreg.setOnClickListener { startActivity(Intent(this, PreviousPregnancyList::class.java))}
        navigateAntenatal.setOnClickListener { startActivity(Intent(this, AntenatalProfileView::class.java))}
        navigatePreventiveService.setOnClickListener { startActivity(Intent(this, PreventiveServiceList::class.java))}
        navigateMalariaProphylaxis.setOnClickListener { startActivity(Intent(this, MalariaProphylaxisList::class.java))}
        navigateMaternalSerology.setOnClickListener { startActivity(Intent(this, MaternalSerologyView::class.java))}

        navigateIfas.setOnClickListener { startActivity(Intent(this, IfasList::class.java))}
        navigatePmtct.setOnClickListener { startActivity(Intent(this, PMTCTInterventionsView::class.java))}
        navigateDeworming.setOnClickListener { startActivity(Intent(this, DewormingView::class.java))}
        navigateCounselling.setOnClickListener { startActivity(Intent(this, CounsellingView::class.java))}

    }

    override fun onBackPressed() {
        super.onBackPressed()

        val intent = Intent(this, NewMainActivity::class.java)
        startActivity(intent)
    }
}