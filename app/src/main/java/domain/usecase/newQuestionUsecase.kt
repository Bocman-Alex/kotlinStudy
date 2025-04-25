package domain.usecase

import domain.models.Question

class newQuestionUsecase
{
	fun execute ():Question{
		return Question(quest = "Gay?", correctAnswer = "Y", firstUnCorrectAnswer = "no", secondUnCorrectAnswer = "never", thirdUnCorrectAnswer = "not")
	}

}