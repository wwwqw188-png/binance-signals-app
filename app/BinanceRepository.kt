package com.example.binancesignals

class BinanceRepository(private val api: BinanceApi) {
    suspend fun getPrice(symbol: String): BinanceTicker {
        return api.getTickerPrice(symbol)
    }
}
