/*
 * MIT License
 *
 * Copyright (c) [2022] [LUIZ O. F. CORRÊA]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.luizotavio.minecraft.common

import me.luizotavio.minecraft.common.enchantment.AbstractPickaxeEnchantment
import me.luizotavio.minecraft.common.settings.MineSettings
import me.luizotavio.minecraft.common.statistic.StatisticType
import org.bukkit.Bukkit
import java.util.*

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
interface MinePlayer {

    fun getName(): String

    fun getUniqueId(): UUID

    fun getPlayer() = Bukkit.getPlayer(getUniqueId())

    fun getStatistics(): EnumMap<StatisticType, Int>

    fun getStatistic(statisticType: StatisticType): Int = getStatistics()[statisticType] ?: 0

    fun setStatistic(statisticType: StatisticType, value: Int) {
        getStatistics()[statisticType] = value
    }

    fun getEnchantments(): MutableMap<AbstractPickaxeEnchantment, Int>

    fun getEnchantment(enchantment: AbstractPickaxeEnchantment): Int = getEnchantments()[enchantment] ?: 0

    fun setEnchantment(enchantment: AbstractPickaxeEnchantment, level: Int) {
        val current = getEnchantment(enchantment)

        if (current != 0) {
            getEnchantments()[enchantment] = current + level
        } else {
            getEnchantments()[enchantment] = level
        }
    }

    fun hasEnchantment(enchantment: AbstractPickaxeEnchantment): Boolean = getEnchantment(enchantment) != 0

    fun getPickaxeLevel(): Int

    fun setPickaxeLevel(level: Int)

    fun getSettings(): MineSettings

}