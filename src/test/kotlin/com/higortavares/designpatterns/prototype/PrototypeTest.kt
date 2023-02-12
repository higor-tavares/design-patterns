package com.higortavares.designpatterns.prototype

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PrototypeTest {

    @Test
    fun testCreateHttpConnection(){
        val httpConnection = HttpConnection("http://localhost", 80)
        val copy = httpConnection.copy() as HttpConnection
        assertThat(copy.url).isEqualTo(httpConnection.url)
        assertThat(copy.port).isEqualTo(httpConnection.port)
        assertThat(copy).isNotEqualTo(httpConnection)
        print(copy)
        print(httpConnection)
    }
    @Test
    fun testCreateJDBCConnection(){
        val jdbcConnection = JDBCConnection("http://localhost", 5432,"testDB", "higor", "1234" )
        val copy = jdbcConnection.copy() as JDBCConnection
        assertThat(copy.host).isEqualTo(jdbcConnection.host)
        assertThat(copy.dbName).isEqualTo(jdbcConnection.dbName)
        assertThat(copy.port).isEqualTo(jdbcConnection.port)
        assertThat(copy.username).isEqualTo(jdbcConnection.username)
        assertThat(copy.password).isEqualTo(jdbcConnection.password)
        assertThat(copy).isNotEqualTo(jdbcConnection)
        print(copy)
        print(jdbcConnection)
    }

}