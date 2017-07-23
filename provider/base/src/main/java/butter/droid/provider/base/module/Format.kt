/*
 * This file is part of Butter.
 *
 * Butter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Butter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Butter. If not, see <http://www.gnu.org/licenses/>.
 */

package butter.droid.provider.base.module

const val FORMAT_NORMAL = 0
const val FORMAT_3D = 1

const val QUALITY_HD = 1080
const val QUALITY_FULL_HD = 1080
const val QUALITY_4K = 2160

@org.parceler.Parcel(org.parceler.Parcel.Serialization.BEAN)
data class Format @org.parceler.ParcelConstructor constructor(val quality: Int, val type: Int)
