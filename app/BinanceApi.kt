package com.example.binancesignals

import retrofit2.http.GET
import retrofit2.http.Query

// Data class representing the price response from Binance
data class BinanceTicker(
    val symbol: String,
    val price: String
)

// Interface defining the API call
interface BinanceApi {
    @GET("api/v3/ticker/price")
    suspend fun getTickerPrice(@Query("symbol") symbol: String): BinanceTicker
}
