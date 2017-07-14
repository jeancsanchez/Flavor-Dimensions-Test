package br.com.jeancarlos.calc.dimentest

/**
 * This class represents a [DimensionDataSource] mock implementation
 * @author Jean Carlos
 * @since 14/07/17
 */
class DimensionDataSourceImpl : DimensionDataSource {
    override fun getDimension(): String {
        return "App2 prod"
    }
}