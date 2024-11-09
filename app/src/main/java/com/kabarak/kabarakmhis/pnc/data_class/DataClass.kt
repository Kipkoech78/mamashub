package com.kabarak.kabarakmhis.pnc.data_class

data class Child(
    val id: String,
    val name: String,
    val birthDate: String,
)
data class BabyTeethRecordDataClass(
    val id: String,
    val dateSeen: String,
    val ageWhenSeen: String,
    val teethType: String?,
)
// Model for questionnaire item
data class QuestionnaireItem(
    val linkId: String,
    val text: String,
    val type: String,
    val answerOptions: List<AnswerOption>? = null,
    val subItems: List<QuestionnaireItem>? = null,
    val enableWhen: List<EnableWhen>? = null
)

// Model for answer option
data class AnswerOption(
    val code: String,
    val display: String
)

// Model for enableWhen conditions
data class EnableWhen(
    val question: String,
    val operator: String,
    val answer: String
)
