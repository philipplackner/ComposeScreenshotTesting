package com.plcoding.composescreenshottesting.ui.login.components

import androidx.compose.foundation.BorderStroke

import com.plcoding.composescreenshottesting.ui.theme.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RuniqueActionButton(
    text: String,
    isLoading: Boolean,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(IntrinsicSize.Min),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = RuniqueGreen,
            contentColor = RuniqueBlack,
            disabledContainerColor = RuniqueGray,
            disabledContentColor = RuniqueBlack
        ),
        shape = RoundedCornerShape(100f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(15.dp)
                    .alpha(
                        if (isLoading) 1f else 0f
                    ),
                strokeWidth = 1.5.dp,
                color = RuniqueBlack
            )
            Text(
                text = text,
                modifier = Modifier
                    .alpha(
                        if (isLoading) 0f else 1f
                    ),
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun RuniqueOutlinedActionButton(
    text: String,
    isLoading: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier
            .height(IntrinsicSize.Min),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = RuniqueWhite
        ),
        border = BorderStroke(0.5.dp, RuniqueWhite),
        shape = RoundedCornerShape(100f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(15.dp)
                    .alpha(
                        if(isLoading) 1f else 0f
                    ),
                strokeWidth = 1.5.dp,
                color = RuniqueWhite
            )
            Text(
                text = text,
                modifier = Modifier
                    .fillMaxHeight()
                    .alpha(
                        if(isLoading) 0f else 1f
                    ),
                fontWeight = FontWeight.Medium
            )
        }
    }
}