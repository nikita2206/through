package com.through.data_source.controller.data

import com.through.data_source.entity.DataSourceType

class DataSourceApi (
    val type: DataSourceTypeApi,
    val hostname: String,
    val port: Int,
    val user: String,
    val password: String
)

enum class DataSourceTypeApi(
    val entityVariant: DataSourceType
) {
    MySQL(DataSourceType.MySQL),
    PostgreSQL(DataSourceType.PostgreSQL)
}
