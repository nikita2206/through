package com.through.data_source.entity

import org.hibernate.annotations.CreationTimestamp
import java.time.ZonedDateTime
import javax.persistence.*

@Entity
class DataSource(
    val type: DataSourceType,
    val hostname: String,
    val port: Int,

    @Column(name = "\"user\"")
    val user: String,

    val password: String
) {
    @Id
    @GeneratedValue
    var id: Long? = null

    @field:CreationTimestamp
    lateinit var created: ZonedDateTime
}

enum class DataSourceType {
    MySQL,
    PostgreSQL
}
