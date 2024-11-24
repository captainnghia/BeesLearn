package fpl.md07.beeslearn.models.responseModel

import fpl.md07.beeslearn.models.GrammarQuestionModel
import fpl.md07.beeslearn.models.TrueFalseQuestionModel
import fpl.md07.beeslearn.models.TrueFalseQuestionModel_A
import fpl.md07.beeslearn.models.Word

data class QuestionResponseModel(
    val words: List<Word>,
    val trueFalseQuestions: List<TrueFalseQuestionModel_A>,
    val grammarQuestions: List<GrammarQuestionModel>
)