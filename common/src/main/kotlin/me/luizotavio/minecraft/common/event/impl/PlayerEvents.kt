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

package me.luizotavio.minecraft.common.event.impl

import me.luizotavio.minecraft.common.MinePlayer
import me.luizotavio.minecraft.common.boost.AbstractPickaxeBoost
import me.luizotavio.minecraft.common.enchantment.AbstractPickaxeEnchantment
import me.luizotavio.minecraft.common.event.WisplyEvent
import me.luizotavio.minecraft.common.settings.MineSettings
import me.luizotavio.minecraft.common.statistic.StatisticType
import org.bukkit.Material
import org.bukkit.entity.Player
import java.util.EnumSet
import java.util.UUID

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerUpgradePickaxeLevelEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val from: Int,
    val to: Int
): WisplyEvent()

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerUpgradeSizeEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val from: Int,
    val to: Int,
    val price: Int
): WisplyEvent()

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerUpdateStatisticEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val statistic: StatisticType,
    val value: Int
): WisplyEvent()

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerChangeBlockTypesEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val from: EnumSet<Material>,
    val to: EnumSet<Material>
): WisplyEvent()

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerPerformsMemberEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val member: UUID,
    val perform: MineSettings.PerformType
): WisplyEvent()

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerUpgradeEnchantmentEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val enchantment: AbstractPickaxeEnchantment,
    val from: Int,
    val to: Int,
    val price: Int
): WisplyEvent()

/**
 * @author Luiz Otávio de Farias Corrêa
 * @since 07/08/2022
 */
data class PlayerPerformsBoostEvent(
    val player: Player,
    val minePlayer: MinePlayer,
    val boost: AbstractPickaxeBoost
): WisplyEvent()

