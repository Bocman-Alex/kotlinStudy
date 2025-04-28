package domain.usecase

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.widget.Button


class ChooseCorrectUsecase
{
	@SuppressLint("ResourceAsColor")
	internal fun equals(str: String, str2: String, button: Button)
	{
		/*	val message = if (str == str2) "correctAnswer" else "unCorrectAnswer"
			Toast.makeText(context, message, Toast.LENGTH_SHORT).show()*/
		if (str == str2)
		{
			button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")))
		} else
		{
			button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#DA0303")))
		}

	}
}