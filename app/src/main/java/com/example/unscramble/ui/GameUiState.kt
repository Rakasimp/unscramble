package com.example.unscramble.ui

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


data class GameUiState(
    val currentScrambledWord: String = ""
)


