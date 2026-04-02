#define DISABLE_FOG
#define DISABLE_LIGHTING
#define NEEDS_NORMDEVCOORDS

technique Default
{
	pass P0
	{
		VertexShader = vertexShaders/diff-tex.vs;
		PixelShader = pixelShaders/pp-spotlight.ps;
		EnableDepthTest = FALSE;
		
		EnableDepthMask = FALSE;
		EnableBlending = TRUE;
		BlendFuncSrc = SRC_ALPHA;
		BlendFuncDst = ONE_MINUS_SRC_ALPHA;
	}
}