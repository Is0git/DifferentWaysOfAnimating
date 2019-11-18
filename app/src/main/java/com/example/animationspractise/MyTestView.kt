package com.example.animationspractise

import android.content.Context
import android.graphics.*
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View

class MyTestView( context: Context): View(context) {
      private lateinit var  mContext:Context
    private lateinit var rect: RectF
    private lateinit var paint: Paint
    private lateinit var text: TextPaint


    constructor(context: Context, attr: AttributeSet? = null): this(context) {
        mContext = context
        init()

    }
    constructor(context: Context,  attr: AttributeSet?, flag: Int): this(context) {
        mContext = context
        init()

    }



    private fun init() {
        rect = RectF(0f, 0f, width.toFloat(), height.toFloat())
        paint = Paint(Color.BLUE)
        text = TextPaint(Paint.ANTI_ALIAS_FLAG)
        text.color = Color.YELLOW
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRoundRect(rect, 0.5f, 0.5f, paint)
        canvas?.drawText("1", 50f, 50f, text )
    }
}