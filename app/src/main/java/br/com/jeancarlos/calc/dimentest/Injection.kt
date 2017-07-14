package br.com.jeancarlos.calc.dimentest

/**
 * This class injects a [DimensionDataSource] implementation
 * @author Jean Carlos
 * @since 14/07/17
 */
class Injection {

    companion object {
        fun providesDimensionDataSource(): DimensionDataSource {
            return DimensionDataSourceImpl()
        }
    }
}