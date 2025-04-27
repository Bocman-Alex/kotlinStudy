package domain.usecase

import domain.models.Question

class NewQuestionUsecase
{
	fun constructQuestion ():Question{
		return Question(quest = "Gay?", correctAnswer = "Y", firstUnCorrectAnswer = "no", secondUnCorrectAnswer = "never", thirdUnCorrectAnswer = "not")
	}

}