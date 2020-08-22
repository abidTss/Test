package com.example.kotlindemo.test

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    var paint: Paint
    var bgpaint: Paint
    var rect: RectF? = null
    var rect2: RectF? = null
    var calHieght: Int = 0

    init {
        println("height $height")
        rect = RectF()
        rect2 = RectF()
        paint = Paint()
        paint.color = Color.BLUE
        bgpaint = Paint()
        bgpaint.color = Color.GREEN
        setWillNotDraw(false)
    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var top = 0f
        var left = 0f
        var k = (height.toFloat() / 10) * calHieght
        println("tothe $k")

        rect?.set(left, top, width + left, height + 0f)
        rect2?.set(left, k, width + left, height + 0f)
        rect?.let { canvas?.drawRect(it, bgpaint) }
        rect2?.let { canvas?.drawRect(it, paint) }
    }

    fun updateHieght(x: Int) {
        for (a in 1..x) {
            //Thread.sleep(100)
            calHieght = a
            Log.d("ind ${height}", "cal height $calHieght")
            invalidate()
            Thread.sleep(1000)
        }
    }
}