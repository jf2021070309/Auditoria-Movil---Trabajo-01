#include "../commons/uniforms.sh"

attribute	highp	vec3	DT_POSITION;
attribute	lowp	vec4	DT_DIFFUSE;

varying	lowp	vec4	V_VertexColor;

void main()
{
	// Transform coordinates to screen space
	gl_Position = TOTALTM * vec4(DT_POSITION, 1);

	V_VertexColor = DT_DIFFUSE;
}
