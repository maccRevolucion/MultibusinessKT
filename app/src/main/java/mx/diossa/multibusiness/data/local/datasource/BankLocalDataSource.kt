package mx.diossa.multibusiness.data.local.datasource

import mx.diossa.multibusiness.data.local.dao.BankDao
import mx.diossa.multibusiness.data.local.entity.BankEntity
import javax.inject.Inject

class BankLocalDataSource @Inject constructor(
    private val bankDao: BankDao
) {
    fun getBanks() = bankDao.getAllBanks()
    suspend fun saveBanks(banks: List<BankEntity>){
        bankDao.insertBanks(banks)
    }
}