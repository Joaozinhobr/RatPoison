package rat.poison.settings

///////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////// --- GENERAL --- ///////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Enables the flat aim script.
 *
 * This script uses traditional flat linear-regression smoothing.
 */
var SHOTGUN_ENABLE_FLAT_AIM = false

/**
 * Enables the path aim script.
 *
 * This script uses an advanced path generation smoothing.
 */
var SHOTGUN_ENABLE_PATH_AIM = true

/**
 * Whether or not to account for recoil when aiming
 */
var SHOTGUN_FACTOR_RECOIL = true

/**
 * Default aim bone the aims go to
 */
var SHOTGUN_AIM_BONE = HEAD_BONE

/**
 * The field of view of the aimbot, in degrees (0 to 360).
 */
var SHOTGUN_AIM_FOV = 40

/**
 * The aimbot's "playback" speed, the higher the value the slower the playback.
 *
 * The minimum value is 1
 */
var SHOTGUN_AIM_SPEED = 1

/**
 * The smoothness of the aimbot
 */
var SHOTGUN_AIM_SMOOTHNESS= 1.0


///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// --- PERFECT AIM --- /////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

/**
 * Whether or not to use perfect aim, which will instantaneously snap
 * to the aim bone once you are within the [PERFECT_AIM_FOV].
 */
var SHOTGUN_PERFECT_AIM = false

/**
 * The FOV, in degrees (0 to 360) to snap for perfect aim.
 */
var SHOTGUN_PERFECT_AIM_FOV = 4

/**
 * The chance, from 1% to 100% (0 to 100) for perfect aim to activate.
 */
var SHOTGUN_PERFECT_AIM_CHANCE = 100